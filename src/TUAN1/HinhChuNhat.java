package TUAN1;

public class HinhChuNhat {
	//khai bao thuoc tinh public kieu double
	public double chieuDai;
	public double chieurong;
	//dong goi chieu dai 
	public void setChieuDai(double cd) throws Exception {
		if(cd>0) {
			this.chieuDai=cd;
		}else throw new Exception("Chieu dai lon hon 0");
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	//dong goi chieu rong 
		public void setChieuRong(double cr) throws Exception {
			if(cr>0) {
				this.chieurong=cr;
			}else throw new Exception("Chieu rong lon hon 0");
		}
		public double getChieuRong() {
			return this.chieurong;
		}
		//tao constructor (ham ta doi tuong)
		public HinhChuNhat() {
			
		}
		public HinhChuNhat(double cd, double cr) {
			this.chieuDai=cd;
			this.chieurong=cr;
		}
		//tinh chu vi
		public double getChuVi(){
			return (getChieuDai()+getChieuRong())*2;
		}
		//tinh dien tich
		public double getDienTich() {
			return getChieuDai()*getChieuRong();
		}
	public static void main(String[] args) throws Exception {
		//khoi tao doi tuong hcn h1
		HinhChuNhat h1=new HinhChuNhat();
		//gan gia tri cho h1
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("Chieu dai da nhap: "+h1.getChieuDai());
		System.out.println("Chieu rong da nhap: "+h1.getChieuRong());
		//tinh chu vi
		System.out.println("Chu vi la: "+h1.getChuVi());
		System.out.println("Dien tich la: "+h1.getDienTich());
	}
}