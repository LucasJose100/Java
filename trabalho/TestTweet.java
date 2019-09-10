public class TestTweet {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("lucas");
		usuario.setUsuario("@globo.com");
		
		usuario.Login();
		
		Tweet t1 = new Tweet();
		t1.Tweetar(usuario);
		
		System.out.println("\r\n");
		usuario.imprimirTweet();
		usuario.Logout();
		
	}

}
