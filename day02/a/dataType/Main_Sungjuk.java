package my.day02.a.dataType;

public class Main_Sungjuk {

	public static void main(String[] args) {
		
		Sungjuk lss_sungjuk = new Sungjuk();
		lss_sungjuk.hakbun = "091234";
		lss_sungjuk.name = "이순신";
		lss_sungjuk.kor = 70;
		lss_sungjuk.eng = 96;
		lss_sungjuk.math = 100;
		
		Sungjuk eom_sungjuk = new Sungjuk();
		eom_sungjuk.hakbun = "109876";
		eom_sungjuk.name = "엄정화";
		eom_sungjuk.kor = 79;
		eom_sungjuk.eng = 58;
		eom_sungjuk.math = 95;
		
		lss_sungjuk.sungjuk_print();		

		eom_sungjuk.sungjuk_print();
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Sungjuk.boolean_print();
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        Sungjuk.char_print();


	}

}
