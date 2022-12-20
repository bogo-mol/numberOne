public class Team {
    private String teamName;
    private Member[] team;

    public Team(String teamName, Member one, Member two, Member three, Member four) {
        this.teamName = teamName;
        this.team = new Member[]{one, two, three, four};
    }

    public void getInfo(Team team) {
        for (int i = 0; i < team.getTeam().length; i++) {
            System.out.println(team.getTeam()[i].getName() + " прошёл дистанцию");
        }
    }

    public void getList(Team team) {
        System.out.println(team.getTeamName() + " - название команды");
        for (int i = 0; i < team.getTeam().length; i++) {
            System.out.println(team.getTeam()[i].getName() + " " + team.getTeam()[i].getAge() + " лет");
        }
    }

    public Member[] getTeam() {
        return team;
    }

    public void setTeam(Member[] team) {
        this.team = team;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
}
