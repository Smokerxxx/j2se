package IUDP2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static final String SERVICE_IP = "127.0.0.1";

    public static final int SERVICE_PORT = 10101;

    public static final int MAX_BYTES = 2048;

    private DatagramSocket service;

    public static void main(String[] args) {
        UDPServer udpService = new UDPServer();
        udpService.startService(SERVICE_IP,SERVICE_PORT);//���������
    }

    private void startService(String ip, int port) {
        try {
            //��װIP��ַ
            InetAddress address = InetAddress.getByName(ip);
            //��������˵�DatagramSocket������Ҫ�����ַ�Ͷ˿ں�
            service = new DatagramSocket(port,address);

            byte[] receiveBytes = new byte[MAX_BYTES];
            //����������Ϣ�İ�����
            DatagramPacket receivePacket = new DatagramPacket(receiveBytes,receiveBytes.length);

            //����һ����ѭ�������Ͻ�������
            while(true){
                try{
                    //�������ݣ��������������һ����ֱ���յ�һ�����ݰ�Ϊֹ
                    service.receive(receivePacket);
                }catch (Exception e){
                    e.printStackTrace();
                }

                //�����յ�������
                String receiveMsg = new String(receivePacket.getData(),0,receivePacket.getLength());
                //�����ͻ��˵�ַ
                InetAddress clientAddress = receivePacket.getAddress();
                //�����ͻ��˶˿�
                int clientPort = receivePacket.getPort();

                //�齨��Ӧ��Ϣ
                String response = "Hello world " + System.currentTimeMillis() + " " + receiveMsg;
                byte[] responseBuf = response.getBytes();
                //������Ӧ��Ϣ�İ���������Ҫ���͵�Ŀ�ĵ�ַ������Ҫ����Ŀ�������ĵ�ַ�Ͷ˿ں�
                DatagramPacket responsePacket = new DatagramPacket(responseBuf,responseBuf.length,clientAddress,clientPort);

                try{
                    //��������
                    service.send(responsePacket);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //�ر�DatagramSocket����
            if(service!=null){
                service.close();
                service = null;
            }
        }
    }

}

