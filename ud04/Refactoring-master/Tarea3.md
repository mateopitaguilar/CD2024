## Breve explicación dos "Code Smell" do proxecto orixinal.

1. **Long method**
   Metodo demasiado largo que deberia dividirse en partes mas pequeñas.
2. **Duplicate code within class**
   Codigo repetido en la misma clase que deberia extrarse a un metodo común.
3. **Duplicate code within method**
   Codigo repetido dentro del mismo metodo.
4. **Duplicate code across classes**
   Mismo codigo copiado en distintas clases.
5. **Magic Number**
   Numero sin contexto utilizado directamente en el codigo.
6. **Feature Envy (2 instances)**
   Un metodo accede mas a datos de otra clase que a los suyos propios.
7. **Improper Naming**
   Nombres poco claros o engañosos en variables, metodos o clases.
8. **Dead Code**
   Codigo que nunca se ejecuta o ya no se usa.
9. **Lazy Class**
    Clase que hace muy poco y no justifica su existencia.
10. **Switch Case**
    Uso excesivo de switch en vez de polimorfismo.
11. **Indecent Exposure**
    Atributos o metodos innecesariamente publicos.
12. **Collapse Hierarchy (Lazy Class)**
    Una subclase que no aporta valor y puede integrarse en la clase padre.
13. **Long Parameter List**
    Metodo con demasiados parametros, dificil de usar y de mantener.

## Breve explicación de cada FIXME

Se eliminaron métodos y atributos que ya no eran utilizados como getPlayerName, printMove, toString de Position y los campos de jugador 1 y jugador 2. Esto mejora la limpieza del código y evita confusión innecesaria.

Se unificó lógica repetida dentro de la clase utilizando el método isEmpty. Esto reduce la duplicación de código y facilita su mantenimiento.

Se mejoró la legibilidad de los métodos como isValidMove, movePiece, updateIsKingDead y updatePawnStatus al pasar directamente objetos en lugar de múltiples valores sueltos. Esto simplifica la firma de los métodos.

```
   //Dead-Code Code Smell fixed by removing getPlayerName and printMove methods (and also toString of Position),
   // as well as player 1 and player 2 fields.


   //Fixed Duplicate Code across methods of same class Code-Smell by calling isEmpty method
   public Piece getPiece(Position position)
   {
      return isEmpty(position) ? null : getCell(position).getPiece();
   }


   //Fixed long parameter list code smell: Pass the object itself instead of passing its data.
   // (isValidMove, movePiece, updateIsKingDead, updatePawnStatus)
   public boolean isValidMove(Position from, Position to)
   {
      return !from.equals(to)
            && !(isPositionOutOfBounds(from) || isPositionOutOfBounds(to))
            && !isEmpty(from)
            && (isEmpty(to) || getPiece(from).getColor() != getPiece(to).getColor())
            && getPiece(from).isValidMove(from, to)
            && hasNoPieceInPath(from, to)
            && (!(getPiece(from) instanceof Pawn) || isValidPawnMove(from, to));
   }
```

Se eliminó la clase MoveUtil porque su existencia no justificaba su uso. La funcionalidad que contenía se trasladó a donde era más relevante. Esto evita mantener clases innecesarias.

```
//Fixed Lazy-class Code Smell by removing MoveUtil class
   public void makeMove(Position from, Position to)
   {
      _chessBoard.movePiece(from, to);
      System.out.println("Piece moved for Player : " + _currentPlayer);
      System.out.println("");
      System.out.println(_chessBoard);
      if (_chessBoard.isKingDead()) {
         endGame();
         initGame();
      } else {
         _currentPlayer = getOtherPlayer();
      }
   }
```

Se simplificaron clases como Bishop, Knight y Rook que aportaban muy poca lógica por sí solas. Mantener estas subclases solo tiene sentido cuando encapsulan comportamiento específico de forma clara.

```
//Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Bishop extends Piece
{


   public Bishop(Color color)
   {
      super(color);
   }


   @Override
   public boolean isValidMove(Position from, Position to)
   {
      return MoveUtil.isDiagonalMove(from, to);
   }


   @Override
   public String toString()
   {
      return "b";
   }
}
```
```
//Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Knight extends Piece
{
   public Knight(Color color)
   {
      super(color);
   }


   public boolean isValidMove(Position from, Position to)
   {
      int columnDiff = Math.abs(to.getColumn() - from.getColumn());
      int rowDiff = Math.abs(to.getRow() - from.getRow());
      return (columnDiff == 2 && rowDiff == 1) || (columnDiff == 1 && rowDiff == 2);
   }


   @Override
   public String toString()
   {
      return "k";
   }
}
```
```
//Fixed Collapsing Hierarchy (another instance of lazy-class)
public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }


    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isHorizontalOrVerticalMove(from, to);
    }


    @Override
    public String toString()
    {
        return "r";
    }
}
```


Se restringió el acceso al atributo _color cambiando su visibilidad a privada. Esto mejora el encapsulamiento y protege los datos del objeto.

```
private Color _color; //Fixed Indecent Exposure Code Smell by making field private
```

Se reemplazó el uso de estructuras condicionales como switch mediante el uso de polimorfismo. Cada subclase ahora implementa su propia lógica de movimiento, eliminando la necesidad de distinguir tipos manualmente.

```
//Fixed Switch-case code smell through polymorphism. Note that type field has also been removed.
   public abstract boolean isValidMove(Position from, Position to);
```
