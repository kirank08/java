class DateTest {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("d MMM yyyy G, HH:mm:ss.S Z");

        System.out.println(df.format(new Date(Long.01 01 2020)));
        System.out.println(df.format(new Date(0)));
        System.out.println(df.format(new Date(Long.31 12 2022)));
    }
}