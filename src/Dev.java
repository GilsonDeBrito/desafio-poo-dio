import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Dev {

    private String nome;
    private  Set<Conteudo> conteudoInscritos = new linkedMashSet<>();
    private Set<Conteudo> conteudoConcluidos = new linkedMashSet<>();

    public void  inscreverBootCamp(BootCamp bootCamp){
        this.conteudoInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    public  void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else {
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXP(){
        return this.conteudoConcluidos.stream().mapToDouble(conteudo-> conteudo.calcularXP()).sum());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public int length() {
        return nome.length();
    }

    public boolean isEmpty() {
        return nome.isEmpty();
    }

    public char charAt(int index) {
        return nome.charAt(index);
    }

    public int codePointAt(int index) {
        return nome.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return nome.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return nome.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return nome.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        nome.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        nome.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return nome.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return nome.getBytes(charset);
    }

    public byte[] getBytes() {
        return nome.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return nome.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return nome.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return nome.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return nome.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return nome.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return nome.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return nome.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return nome.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return nome.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return nome.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return nome.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return nome.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return nome.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return nome.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return nome.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return nome.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return nome.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return nome.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return nome.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return nome.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return nome.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return nome.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return nome.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return nome.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return nome.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return nome.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return nome.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return nome.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return nome.split(regex, limit);
    }

    public String[] split(String regex) {
        return nome.split(regex);
    }

    public String toLowerCase(Locale locale) {
        return nome.toLowerCase(locale);
    }

    public String toLowerCase() {
        return nome.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return nome.toUpperCase(locale);
    }

    public String toUpperCase() {
        return nome.toUpperCase();
    }

    public String trim() {
        return nome.trim();
    }

    public String strip() {
        return nome.strip();
    }

    public String stripLeading() {
        return nome.stripLeading();
    }

    public String stripTrailing() {
        return nome.stripTrailing();
    }

    public boolean isBlank() {
        return nome.isBlank();
    }

    public Stream<String> lines() {
        return nome.lines();
    }

    public String indent(int n) {
        return nome.indent(n);
    }

    public String stripIndent() {
        return nome.stripIndent();
    }

    public String translateEscapes() {
        return nome.translateEscapes();
    }

    public <R> R transform(Function<? super String, ? extends R> f) {
        return nome.transform(f);
    }

    public IntStream chars() {
        return nome.chars();
    }

    public IntStream codePoints() {
        return nome.codePoints();
    }

    public char[] toCharArray() {
        return nome.toCharArray();
    }

    public String formatted(Object... args) {
        return nome.formatted(args);
    }

    public String intern() {
        return nome.intern();
    }

    public String repeat(int count) {
        return nome.repeat(count);
    }

    public Optional<String> describeConstable() {
        return nome.describeConstable();
    }

    public String resolveConstantDesc(MethodHandles.Lookup lookup) {
        return nome.resolveConstantDesc(lookup);
    }

    @Override
    public boolean equals(Object o) {  
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
