import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class RegistroDiretorioAno {
	private short year;
	private short amount;
	private long iniPos;
	public RegistroDiretorioAno() {
		
	}
	public RegistroDiretorioAno(short year, short amount, long iniPos) {
		this.year = year;
		this.amount = amount;
		this.iniPos = iniPos;
	}
	public RegistroDiretorioAno(byte[] ba) throws IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(ba);
        DataInputStream dis = new DataInputStream(bais);
        this.year = dis.readShort();
        this.amount = dis.readShort();
        this.iniPos = dis.readLong();
	}
	public byte[] getBa() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeShort(this.year);
		dos.writeShort(this.amount);
		dos.writeLong(iniPos);
		return baos.toByteArray();
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public short getAmount() {
		return amount;
	}
	public void setAmount(short amount) {
		this.amount = amount;
	}
	public long getIniPos() {
		return iniPos;
	}
	public void setIniPos(long iniPos) {
		this.iniPos = iniPos;
	}
	
}
