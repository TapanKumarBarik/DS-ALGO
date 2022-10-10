
/*
7*21
---------.|.---------
------.|.|.|.|.------
---.|.|.|.|.|.|.|.---
-------WELCOME--------
---.|.|.|.|.|.|.|.---
------.|.|.|.|.------
---------.|.---------
*******************************************

11*33
---------------.|.---------------
------------.|.|.|.|.------------
---------.|.|.|.|.|.|.|.---------
------.|.|.|.|.|.|.|.|.|.|.------
---.|.|.|.|.|.|.|.|.|.|.|.|.|.---
-------------WELCOME--------------
---.|.|.|.|.|.|.|.|.|.|.|.|.|.---
------.|.|.|.|.|.|.|.|.|.|.------
---------.|.|.|.|.|.|.|.---------
------------.|.|.|.|.------------
---------------.|.---------------
*******************************************
9*27
------------.|.------------
---------.|.|.|.|.---------
------.|.|.|.|.|.|.|.------
---.|.|.|.|.|.|.|.|.|.|.---
----------WELCOME-----------
---.|.|.|.|.|.|.|.|.|.|.---
------.|.|.|.|.|.|.|.------
---------.|.|.|.|.---------
------------.|.------------
 */

public class PatterenMattress {
    public static void main(String[] args) {

        patteren(7, 21);
        System.out.println("*******************************************");
        patteren(11, 33);
        System.out.println("*******************************************");
        patteren(9, 27);
    }

    private static void patteren(int m, int n) {

        int threeMulti = 3;
        int finalIndex = 0;
        for (int i = 0; i < m / 2; i++) {
            int index = 0;
            for (int j = 0; j < (n - threeMulti) / 2; j++) {
                System.out.print("-");
                index++;
            }
            for (int k = 0; k < threeMulti; k++) {
                if (k % 2 == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("|");
                }
                index++;
            }
            for (int j = index; j < n; j++) {
                System.out.print("-");
            }
            threeMulti += 6;
            finalIndex = threeMulti;

            System.out.println("");
        }

        // welcome
        int count = 0;
        for (int i = 0; i < (n - 7) / 2; i++) {
            System.out.print("-");
            count++;
        }
        count += 6;
        System.out.print("WELCOME");
        for (int i = count; i < n; i++) {
            System.out.print("-");
        }
        System.out.println("");

        // 2nd part
        finalIndex -= 6;
        for (int i = 0; i < m / 2; i++) {
            int index = 0;
            for (int j = 0; j < (n - finalIndex) / 2; j++) {
                System.out.print("-");
                index++;
            }
            for (int k = 0; k < finalIndex; k++) {
                if (k % 2 == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("|");
                }
                index++;
            }
            for (int j = index; j < n; j++) {
                System.out.print("-");
            }
            finalIndex -= 6;
            System.out.println("");
        }
    }
}
