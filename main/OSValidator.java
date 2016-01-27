package game.main;

/**
 * Validador de Sistema Operacional
 * @author Andr� Micheletti
 *
 */
public class OSValidator {
	
	/**
	 * Pega a string que identifica o OS
	 */
	private static String OS = System.getProperty("os.name").toLowerCase();
	 
	/**
	 * Checa se o OS � Windows
	 * @return true se windows, false caso contr�rio
	 */
	public static boolean isWindows() { 
		return (OS.indexOf("win") >= 0); 
	}
 
	/**
	 * Checa se o OS � Mac
	 * @return true se mac, false caso contr�rio
	 */
	public static boolean isMac() { 
		return (OS.indexOf("mac") >= 0); 
	}
	
	/**
	 * Checa se o OS � Unix
	 * @return true se unix, false caso contr�rio
	 */
	public static boolean isUnix() { 
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 ); 
	}
	
	/**
	 * Checa se o OS � Solaris
	 * @return true se solaris, false caso contr�rio
	 */
	public static boolean isSolaris() { 
		return (OS.indexOf("sunos") >= 0); 
	}

}
