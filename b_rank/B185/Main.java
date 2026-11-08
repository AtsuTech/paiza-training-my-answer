package b_rank.B185;


// 長さ N の英大文字からなる文字列が与えられます。
// 文字列中にある LOVE の部分列の数を出力してください。

// ここで部分列とは、文字列から取り出した文字を順番を変えずに並べたものです。
// たとえば、S が LOVE の場合、S の部分列には L, LO, LOV, LOVE などがありますが、このうち "LOVE" になるものは 1つ です。

// 入力例 1

// 入力例 1 の場合、

// ・1, 2, 3, 4 文字目
// ・1, 2, 3, 6 文字目
// ・1, 2, 3, 10 文字目
// ・1, 2, 8, 10 文字目

// が LOVE の部分列となります。
// LOVE の部分列の数は 4 つなので 4 と出力してください。

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        //Scanner sc = new Scanner(System.in);


        String length = "10";
        String line = "LOVEHEAVYE";


        // String length = "12";
        // String line = "LOVELOVELOVE";


        //=============ここから=============



        //文字の長さ
        int max = Integer.parseInt(length);
        List<String> target = new ArrayList<>(Arrays.asList("L", "O", "V", "E"));

        //Lの登場回数
        // int L_count = 0;
        // for (int i = 0; i < max; i++) {
        //     if(String.valueOf(line.charAt(i)) == "L"){
        //         L_count++;
        //     }
        // }

        //登場するLのindexを記録
        List<Integer> L_positions = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if(String.valueOf(line.charAt(i)) == "L"){
                L_positions.add(i);
            }
        }







        // int checkCount = 0;
        // int L_count = 0;
        // int result = 0;
        // for (int i = 0; i < max; i++) {
        //     if(String.valueOf(line.charAt(i)) == "L"){
        //         L_positions.add(i);
        //     }
        //     switch ( String.valueOf(line.charAt(i)) ) {
        //         case "L":
        //             checkCount++;
        //             L_count++;
        //             break;
        //         case "O":
        //             checkCount++;
        //             break;
        //         case "V":
        //             checkCount++;
        //             break;
        //         case "E":
        //             checkCount++;
        //             break;
        //     }
        //     if(checkCount == 4){
        //         result++;
        //     }
        //     if(checkCount == 4){
        //         checkCount = 0;
        //     }

        // }
        // System.out.println(L_count);
        // System.out.println(result);


        //String match = "LOVE";
        // if(line.matches(".*LOVE.*")){
        //     System.out.println("");
        // }

        int result = 0;
        
        //LOVEの文字だけにフィルタ
        List<Character> strings = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if(target.contains(String.valueOf(line.charAt(i)))){
                
                switch ( String.valueOf(line.charAt(i)) ) {
                    case "L":
                        strings.add(line.charAt(i));
                        break;
                    case "O":
                        strings.add(line.charAt(i));
                        break;
                    case "V":
                        strings.add(line.charAt(i));
                        break;
                    case "E":
                        strings.add(line.charAt(i));
                        break;
                }
            }
        }





        // for (int i = 0; i < strings.size(); i++) {
        //     // if(String.valueOf(line.charAt(i)) == "L"){
        //     //     //L_positions.add(i);

        //     // }
        //     if(i+3 < strings.size()){
        //         String love = String.valueOf(line.charAt(i))+String.valueOf(line.charAt(i+1))+String.valueOf(line.charAt(i+2))+String.valueOf(line.charAt(i+3));
        //         System.out.println(love);
        //         if(love =="LOVE"){
        //             result++;
        //         }
        //     }
            
        // }

        // while (strings.size()>0) {
        //     for (int i = 0; i < strings.size(); i++) {

        //         if(i+3 < strings.size()){
        //             String love = String.valueOf(line.charAt(i))+String.valueOf(line.charAt(i+1))+String.valueOf(line.charAt(i+2))+String.valueOf(line.charAt(i+3));
        //             System.out.println(love);
        //             if(love =="LOVE"){
        //                 result++;
        //             }
        //         }

        //         switch ( String.valueOf(line.charAt(i)) ) {
        //             // case "L":
        //             //     strings.remove(line.charAt(i));
        //             //     break;
        //             case "O":
        //                 strings.remove(line.charAt(i));
        //                 break;
        //             case "V":
        //                 strings.remove(line.charAt(i));
        //                 break;
        //             case "E":
        //                 strings.remove(line.charAt(i));
        //                 break;
        //         }
                
        //     }
            
        // }
        System.out.println(result);
        System.out.println(strings.size());


        // for (int i = 0; i < max; i++) {
        //     if(String.valueOf(line.charAt(i)) == "L"){
        //         L_positions.add(i);
        //     }
        // }
        
        // for(char t: strings){
        //     System.out.println(t);
        // }
        
    }
}



// java b_rank/B185/Main.java



