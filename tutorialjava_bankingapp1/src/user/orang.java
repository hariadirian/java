package user;

public abstract class orang {
	
	private String alamat = "Kantor Pusak Jl. Merdeka 21 Jakarta "; 
	
		void nama() {
			System.out.print("Nama lengkap: ") ;
		}
		
		
		void setAlamat(String var_alamat) {
			alamat = var_alamat ;	
		}
		
		String getAlamat() {
			return alamat;
		}
		
		abstract void jenisKelamin() ;
			
		
		
		abstract void pekerjaan() ;
			
		
		
		
		abstract void status() ;
			
		
	
}
