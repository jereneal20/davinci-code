
abstract public class Network
{
	protected mWindow m_Taget;//채팅 메세지를 받으면 전달할 대상 
	protected Network m_net;
	abstract public void Connet(String ip);//지정된 ip로 접속하는 함수
	abstract public void SendChatMsg(String msg);//접속된 네트워크에 msg를 날리는 함수
	abstract public void Close();//모든접속을 끊는 함수. 쓰레드 종료필수
}
