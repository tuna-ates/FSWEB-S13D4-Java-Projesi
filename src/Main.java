public class Main {
    public static <Scanner> void main(String[] args) {

        //System.out.println("Hello world!");
        Point first=new Point(6,5);
        Point second=new Point(3,1);

      /*  System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());*/

        Player player=new Player("tuna",50,Weapon.AK47);
        System.out.println("healthRemaining:"+player.healthRemaining());
        player.loseHealth(70);
        System.out.println("healthRemaining:"+player.healthRemaining());
        player.restoreHealth(45);
        System.out.println("healthRemaining:"+player.healthRemaining());
        System.out.println(player);
    }
}