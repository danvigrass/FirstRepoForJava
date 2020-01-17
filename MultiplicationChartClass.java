public class MultiplicationChartClass implements MultiplicationChartInterface {
    private int num;

    public MultiplicationChartClass(int nume)
    {
        num = nume;
    }
    @Override
    public void displayChart()
    {
        int i, j;
        int m=1;
        System.out.print("X | \t");
        for(i =1;i<=num;i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.println("-------------------------------------------------------------");
        for(i=1; i<=num; i++)
        {
            System.out.print(i + " | \t");
            for(j=1; j<=num;j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.print("\n");
        }

    }

}
