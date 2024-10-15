import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;



public class KeyAdressPair {
	private short key;
	private long adress, leftSon, rightSon;
	KeyAdressPair(){
		
	}
	KeyAdressPair(byte[] ba) throws IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(ba);
        DataInputStream dis = new DataInputStream(bais);
        this.leftSon = dis.readLong();
        this.key = dis.readShort();
        this.adress = dis.readLong();
        this.rightSon = dis.readLong();
	}
	KeyAdressPair(short key, long adress) throws IOException{
		this.key = key;
		this.adress = adress;
		this.rightSon = this.leftSon = -1;
	}
	KeyAdressPair(long leftSon, short key, long adress, long rightSon) throws IOException{
		this.key = key;
		this.adress = adress;
		this.leftSon = leftSon;
		this.rightSon = rightSon;
	}
	public byte[] getBa() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(leftSon);
		dos.writeShort(key);
		dos.writeLong(adress);
		dos.writeLong(rightSon);
		return baos.toByteArray();
	}
	public short getKey() {
		return key;
	}
	public void setKey(short key) {
		this.key = key;
	}
	public long getAdress() {
		return adress;
	}
	public void setAdress(long adress) {
		this.adress = adress;
	}
	public long getLeftSon() {
		return leftSon;
	}
	public void setLeftSon(long leftSon) {
		this.leftSon = leftSon;
	}
	public long getRightSon() {
		return rightSon;
	}
	public void setRightSon(long rightSon) {
		this.rightSon = rightSon;
	}
}
