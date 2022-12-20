public class Main {
    public static void main(String[] args) {
        Member one = new Member("Вася", 30);
        Member two = new Member("Петя", 40);
        Member three = new Member("Денис", 20);
        Member four = new Member("Паша", 25);
        Team team = new Team("Бригада", one, two, three, four);
        team.getInfo(team);
        team.getList(team);

        Barrier oneBarrier = new Barrier("яма с кольями");
        Barrier twoBarrier = new Barrier("бассейн");
        Barrier threeBarrier = new Barrier("канатная дорожка");
        Course course = new Course();
        course.run(team, oneBarrier, twoBarrier, threeBarrier);
    }
}
