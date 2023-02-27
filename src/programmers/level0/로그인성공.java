package programmers.level0;

public class 로그인성공 {
    public static void main(String[] args) {
        String[] id_pw1 = {"meosseugi", "1234"};
        String[][] db1 = {
                {"rardss", "123"},       //(0,0)(0,1)
                {"yyoom", "1234"},      //(1,0)(1,1)
                {"meosseugi", "1234"}}; //(2,0)(2,1)

        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = {
                {"programmer02", "111111"},
                {"programmer00", "134"},
                {"programmer01", "1145"}};

        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = {
                {"jaja11", "98761"},
                {"krong0313", "29440"},
                {"rabbit00", "111333"}};

        String[] id_pw4 = {"meosseugi", "1234"};
        String[][] db4 = {
                {"rardss", "123"},
                {"meosseugi", "1234"},
                {"yyoom", "1234"}};

        System.out.println(로그인성공.solution1(id_pw1, db1)); //login
        System.out.println(로그인성공.solution1(id_pw2, db2)); //wrong pw
        System.out.println(로그인성공.solution1(id_pw3, db3)); //fail
        System.out.println(로그인성공.solution1(id_pw4, db4)); //login

        System.out.println(로그인성공.solution2(id_pw1, db1)); //login
        System.out.println(로그인성공.solution2(id_pw2, db2)); //wrong pw
        System.out.println(로그인성공.solution2(id_pw3, db3)); //fail
        System.out.println(로그인성공.solution2(id_pw4, db4)); //login
    }

    /////////////////[solution 시작]/////////////////
    public static String solution1(String[] id_pw, String[][] db) {
        String answer = "";
        String userId = id_pw[0];
        String userPass = id_pw[1];

        for (int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPass = db[i][1];

            if (userId.equals(dbId)) {
                if (userPass.equals(dbPass)) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
            }
        }
        return answer;
    }

    public static String solution2(String[] id_pw, String[][] db) {
        String answer = "";

        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return  "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}
