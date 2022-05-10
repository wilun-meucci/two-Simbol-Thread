public class thread1 implements Runnable{
    private String simbolo;
    private int count;

    public thread1(String simbolo,int count)
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
