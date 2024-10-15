import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ListNode {
	private short id;
	private String country;
	private long nextCountry;
	private short year;
	private long nextYear;
	
	public ListNode(){
		
	}
	
	public ListNode(short id, String country, long nextCountry, short year, long nextYear) throws IOException{
		this.id = id;
		this.country = country;
		this.nextCountry = nextCountry;
		this.year = year;
		this.nextYear = nextYear;
	}
	
	public ListNode(byte[] ba) throws IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(ba);
        DataInputStream dis = new DataInputStream(bais);
        this.id = dis.readShort();
        this.nextCountry = dis.readLong();
        this.nextYear = dis.readLong();
	}
	public byte[] getBa() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeShort(this.id);
		dos.writeLong(this.nextCountry);
		dos.writeLong(this.nextYear);
		return baos.toByteArray();
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getNextCountry() {
		return nextCountry;
	}

	public void setNextCountry(long nextCountry) {
		this.nextCountry = nextCountry;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public long getNextYear() {
		return nextYear;
	}

	public void setNextYear(long nextYear) {
		this.nextYear = nextYear;
	}
}
