public class Course {
    private Barrier[] course;

    public void run(Team team, Barrier one, Barrier two, Barrier three) {
        this.course = new Barrier[]{one, two, three};
        for (int i = 0; i < team.getTeam().length; i++) {
            for (Barrier barrier : course) {
                System.out.println(team.getTeam()[i].getName() + " прошёл " + barrier.getName() + " успешно");
            }
        }
        System.out.println("Все препятствия пройдены");
    }

    public Barrier[] getCourse() {
        return course;
    }

    public void setCourse(Barrier[] course) {
        this.course = course;
    }
}
