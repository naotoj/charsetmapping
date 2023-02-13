public class Main {
    private static final String MODBASE = "/home/nsato/projects/jdk/git/jdk/open/src/java.base/";
    private static final String MODEXT = "/home/nsato/projects/jdk/git/jdk/open/src/jdk.charsets/";
    public static void main(String[] args) throws Throwable {
        var para = new String[] {
            "/home/nsato/projects/jdk/git/jdk/open/make/data/charsetmapping",
            "out",
            "stdcs",
            "charsets",
            "stdcs-linux",
            MODBASE + "share/classes/sun/nio/cs/StandardCharsets.java.template",
                MODEXT + "share/classes/sun/nio/cs/ext",
                "/home/nsato/projects/jdk/git/jdk/open/make/jdk/src/classes/build/tools/charsetmapping"
        };
        build.tools.charsetmapping.Main.main(para);
    }
}