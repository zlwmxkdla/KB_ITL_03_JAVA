package codingtest;
import java.io.*;
import java.util.*;
public class week04_벽부수고이동하기 {
    static int N,M, answer = Integer.MAX_VALUE;
    static int [][]arr;
    static int []dx = {-1,0,0,1};
    static int []dy = {0,1,-1,0};
    public static void main(String[]args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];

        List<int[]> list = new ArrayList<>(); //모든 벽의 위치를 저장할 배열리스트
        list.add(new int[] {1,1}); //시작 위치를 넣음으로써 벽을 부수지 않았을 경우의 최단 경로
        for(int i=1;i<=N;i++) {
            String line = bf.readLine();
            for(int j=0;j<M;j++) {
                if(line.charAt(j)=='0')arr[i][j+1]=0;
                else arr[i][j+1]=1;

                if(arr[i][j+1]==1) {
                    list.add(new int[] {i,j+1});//벽의 위치(x좌표, y좌표) 저장
                }
            }
        }

        for(int i=0;i<list.size();i++) {
            arr[list.get(i)[0]][list.get(i)[1]]=0;
            boolean[][] visited = new boolean[N+1][M+1];

            int count = 0;
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[] {1,1});
            visited[1][1]=true;

            while(!q.isEmpty()) {
                int[] now = q.poll();
                for(int j=0;j<4;j++) {
                    int nx = now[0] + dx[j];
                    int ny = now[1] + dy[j];
                    if((nx>0&&nx<=N)&&(ny>0&&ny<=M)) {
                        if(nx==N && ny==M) {
                            count +=1;
                            break;
                        }
                        if(!visited[nx][ny]&&arr[nx][ny]==0) {
                            count++;
                            visited[nx][ny]=true;
                            q.add(new int[] {nx,ny});
                        }
                    }
                }
            }
            answer = Math.min(answer, count);
            arr[list.get(i)[0]][list.get(i)[1]]=1; //다시 원상 복귀
        }

        System.out.println(answer);
    }
}
