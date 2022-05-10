public class thread2 implements Runnable{
    private String simbolo;
    private int count;

    public thread2(String simbolo,int count)
    {
        this.simbolo = simbolo;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i < count+1;i++)
        {
            System.out.print(simbolo);
            if (i%10 == 0)
                System.out.print("\n");
            
        }
        
    }

}