package r2b.apps.lib.supersecretkey;

public final class SuperSecretKey {

	/**
	 * Get the secret key from java method.
	 * @return The secret key.
	 */
	public final String get() {
		return getKey();
	}

	/**
	 * A native method that is implemented by the 'key' native library,
	 * which is packaged with this application.
	 */
	public native String getKey();

	/**
	 * Load the native library where the native method is stored.
	 */
	static {
		System.loadLibrary("key");
	}
	
}
