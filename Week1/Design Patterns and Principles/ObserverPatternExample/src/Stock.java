public interface Stock {
    public void register(Observer observer);
    public void deRegister(Observer observer);
    public void Notify();
}
