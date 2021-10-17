package musementpark.offline.base.chair.flyweight;

import static org.junit.jupiter.api.Assertions.*;

class ChessTest {
    public static void main(String[] args) {
        Chess chess = ChessFactory.getChess("黑色");
        Chess chess1 = ChessFactory.getChess("黑色");
        System.out.println(chess);
        System.out.println(chess1);

        System.out.println("=====增加外部状态=====");

        chess.display(new Coordinate(10,10));
        chess1.display(new Coordinate(20,20));
    }
}