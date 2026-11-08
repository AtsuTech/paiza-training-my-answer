package b_rank.B109;

// B109:【50万人記念問題】映画館の席の予約
// 1時間44分34秒経過
// 6時間経過で時間切れ

// あなたは、映画館の席の予約をしようとしています。

// 座席は、縦の位置を表す p と横の位置を表す q の (p, q) で指定でき、最も左上の席が (0, 0) となっています。
// 映画館には、最も見やすい席が 1 席存在し、最も映画を見やすい席とのマンハッタン距離が小さいほど、映画を見やすくなっています。

// マンハッタン距離とは、ある 2 点 (p, q)、(s, t) に対して、|p - s| + |q - t| で与えられる距離を表します。

// あなたは、できるだけ映画を見やすい席を予約しようと思っています。
// 最も見やすい席とすでに予約されている席の情報が与えられるので、まだ予約されていない席の中で、最も映画を見やすい席を求めてください。

// 入力例 1 の場合、映画館の席は縦 4 列、横 5 列の計 20 箇所の席があります。最も見やすい席は (2, 3) にあります。

// 最も見やすい席 (2, 3) は予約済みであり、予約されていない席で最も見やすい席とのマンハッタン距離が最も小さい席は、
// 以下の図のように、マンハッタン距離 2 の (0, 3), (3, 2), (2, 1) の 3 箇所です。それぞれの位置のマンハッタン距離は、
// |2 - 0| + |3 - 3|, |2 - 3| + |3 - 2|, |2 - 2| + |3 - 1| と計算されます。まだ予約されていない席の中で、
// 最も映画を見やすい席をすべて出力してください。どのような出力順序でも構いません。



// 入力例1
// 9 4 5 2 3
// 1 0
// 1 2
// 1 3
// 1 4
// 2 2
// 2 3
// 2 4
// 3 3
// 3 4



import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        //Scanner sc = new Scanner(System.in);
        //String data[][] = new String[10][];

        
        int i = 10;
        
        // while(sc.hasNextLine()){
        //     String line = sc.nextLine();
        //     data[i]=line.split(" ");
        //     i++;
        // } 


        String[] lines = {
            "9 4 5 2 3",
            "1 0", "1 2", "1 3", "1 4",
            "2 2", "2 3", "2 4",
            "3 3", "3 4"
        };
        String[][] data = new String[lines.length][];
        for (int j = 0; j < lines.length; j++) {
            data[j] = lines[j].split(" ");
        }



        //----------------------ここから----------------------
        
        int W = Integer.parseInt(data[0][2]);
        int H = Integer.parseInt(data[0][1]);

        
        int p = Integer.parseInt(data[0][3]);
        int q = Integer.parseInt(data[0][4]);

        //Set<int[]> removeReserved = new HashSet<>();
        Set<String> reserved = new HashSet<>();
        for(int x=1;x<i;x++){
            String s = data[x][0];
            String t = data[x][1];
            reserved.add(s+" "+t);
        }

        //System.out.println(W);
        // System.out.println(H);

        
        // 縦横
        //W
        // for(int w=0;w<H;w++){
        //     //H
        //     for(int h=0;h<W;h++){

        //         String w_h = String.valueOf(w)+" "+String.valueOf(h);
        //         if(!reserved.contains(w_h)){

        //             int p_s = p-w;
        //             if(p_s<0){
        //                 p_s = -1*p_s;
        //             }
                    
        //             int q_t = q-h;
        //             if(q_t<0){
        //                 q_t = -1*q_t;
        //             }

        //             if((p_s)+(q_t) == 2){
        //                 System.out.println(String.valueOf(w)+" "+String.valueOf(h));
        //             }
        //         }
        //     }
        // }


        for(int h=0;h<H;h++){
            //H
            for(int w=0;w<W;w++){

                String w_h = String.valueOf(h)+" "+String.valueOf(w);
                if(!reserved.contains(w_h)){

                    int p_s = p-h;
                    if(p_s<0){
                        p_s = -1*p_s;
                    }
                    
                    int q_t = q-w;
                    if(q_t<0){
                        q_t = -1*q_t;
                    }

                    if((p_s)+(q_t) == 2){
                        System.out.println(String.valueOf(h)+" "+String.valueOf(w));
                    }
                }
            }
        }
    }
    
    
}

// java b_rank/B109/Main.java




//----------------------------------ランタイムエラーになったコード----------------------------------
// import java.util.*;
// public class Main {
    
//     public static void main(String[] args) {
//         // 自分の得意な言語で
//         // Let's チャレンジ！！
//         Scanner sc = new Scanner(System.in);
//         String data[][] = new String[1000][];
        
//         int i = 0;
        
//         while(sc.hasNextLine()){
//             String line = sc.nextLine();
//             data[i]=line.split(" ");
//             i++;
//         } 
        
//         int W = Integer.parseInt(data[0][2]);
//         int H = Integer.parseInt(data[0][1]);
//         // System.out.println(W);
//         // System.out.println(H);
        
//         int p = Integer.parseInt(data[0][3]);
//         int q = Integer.parseInt(data[0][4]);
        
//         //予約済み
//         Set<String> reserved = new HashSet<>();
//         for(int x=1;x<i;x++){
//             String s = data[x][0];
//             String t = data[x][1];
//             reserved.add(s+" "+t);
//         }
        
//         //マンハッタン距離
//         int current_dist = 0;
//         int min_dist = p+q;
//         for(int h=0;h<H;h++){
//             //H
//             for(int w=0;w<W;w++){

//                 String w_h = String.valueOf(h)+" "+String.valueOf(w);
                
//                 if(!reserved.contains(w_h)){

//                     int p_s = p-h;
//                     if(p_s<0){
//                         p_s = -1*p_s;
//                     }
                    
//                     int q_t = q-w;
//                     if(q_t<0){
//                         q_t = -1*q_t;
//                     }
                    
//                     current_dist = (p_s)+(q_t);
//                     if(current_dist < min_dist){
//                         min_dist = current_dist;
//                     }

//                     // if((p_s)+(q_t) == 2){
//                     //     System.out.println(String.valueOf(h)+" "+String.valueOf(w));
//                     // }
//                 }
//             }
//         }
//         //System.out.println(min_dist);
        
        
//         // 縦横
//         for(int h=0;h<H;h++){
//             //H
//             for(int w=0;w<W;w++){

//                 String w_h = String.valueOf(h)+" "+String.valueOf(w);
                
//                 if(!reserved.contains(w_h)){

//                     int p_s = p-h;
//                     if(p_s<0){
//                         p_s = -1*p_s;
//                     }
                    
//                     int q_t = q-w;
//                     if(q_t<0){
//                         q_t = -1*q_t;
//                     }

//                     if((p_s)+(q_t) == min_dist){
//                         System.out.println(String.valueOf(h)+" "+String.valueOf(w));
//                     }
//                 }
//             }
//         }
//         //
//     }
    
    
// }



// ==============================AI提案==============================
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int H = sc.nextInt();
//         int W = sc.nextInt();
//         int p = sc.nextInt();
//         int q = sc.nextInt();

//         boolean[][] reserved = new boolean[H][W];
//         for (int x = 0; x < n; x++) {
//             int s = sc.nextInt();
//             int t = sc.nextInt();
//             reserved[s][t] = true;
//         }

//         int min = Integer.MAX_VALUE;
//         for (int h = 0; h < H; h++) {
//             for (int w = 0; w < W; w++) {
//                 if (!reserved[h][w]) {
//                     int d = Math.abs(p - h) + Math.abs(q - w);
//                     if (d < min) min = d;
//                 }
//             }
//         }

//         StringBuilder sb = new StringBuilder();
//         for (int h = 0; h < H; h++) {
//             for (int w = 0; w < W; w++) {
//                 if (!reserved[h][w] && Math.abs(p - h) + Math.abs(q - w) == min) {
//                     sb.append(h).append(" ").append(w).append("\n");
//                 }
//             }
//         }
//         System.out.print(sb);
//     }
// }