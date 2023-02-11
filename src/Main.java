public class Main {
    private static final String MODDIR = "/Users/nsato/dev/jdk/git/unicode/open/src/jdk.charsets/";
    public static void main(String[] args) throws Throwable {
        var para = new String[] {
            "/Users/nsato/dev/jdk/git/unicode/open/make/data/charsetmapping",
            "out",
            "extcs",
            "charsets",
            "stdcs-linux",
            MODDIR + "share/classes/sun/nio/cs/ext/ExtendedCharsets.java.template",
                MODDIR + "share/classes/sun/nio/cs/ext",
                "/Users/nsato/dev/jdk/git/unicode/open/make/jdk/src/classes/build/tools/charsetmapping"
        };
        build.tools.charsetmapping.Main.main(para);
    }
}