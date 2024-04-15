package OOPS;

public class Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
        Rook rook = new Rook();
        rook.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up , DOwn , Left , Right, daigonal (all directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up , DOwn , Left , Right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up , DOwn , Left , Right (all directions)");
    }
}