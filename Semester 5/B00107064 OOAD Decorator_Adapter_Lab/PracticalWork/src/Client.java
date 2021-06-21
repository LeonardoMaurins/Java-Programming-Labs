public class Client {
	static public void main(String argv[]) {
		// The string that will be decorated
		String url = "design-patterns.com";

		// An object reference created for the string
		Url t1 = new Url(url);
		HttpDecorator t2 = new HttpDecorator(new Url(url));
		FtpDecorator t3 = new FtpDecorator(new Url(url));
		HttpsDecorator t4 = new HttpsDecorator(new Url(url));
		System.out.println("Text object show()");
		t1.show();
		System.out.println();
		System.out.println("Http decorated text show()");
		t2.show();
		System.out.println();
		System.out.println("Ftp decorated text show()");
		t3.show();
		System.out.println();
		System.out.println("Https decorated text show()");
		t4.show();
	}
}
