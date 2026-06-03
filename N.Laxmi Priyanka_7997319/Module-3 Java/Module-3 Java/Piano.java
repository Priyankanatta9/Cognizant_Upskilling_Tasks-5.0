interface Playable{
    void play();
}
class Piano implements Playable {
    public void play(){
        System.out.println("I am a piano. I have keys.");
    }

    public static void main(String[] args) {
        Piano p=new Piano();
        Guitar g=new Guitar();
        p.play();
        g.play();
    }
}
class Guitar implements Playable{
    public void play(){
        System.out.println("I am a guitar. I have strings.");
    }
}
