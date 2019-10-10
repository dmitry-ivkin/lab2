public class TestAuthor {
    public static void main(String[] age) {
        Author al = new Author("Дмитрий", "ivkin@gmail.com", 'M');
        System.out.println(al);
        al.setEmail("ivkin@gmail.com");
        System.out.println(al);
    }
}
