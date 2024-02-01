package HomeWorkFinalV2.Servise;

public class Counter implements AutoCloseable{

    private int count = 0;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        if (count == 0)
            throw new Exception("Счетчик не увеличился, или ресурс не был закрыт.");
    }
}

