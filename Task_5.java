
public class Task_5 {
  public static void main(String[] args) {
    var map = StartMap();

    System.out.println(MapToString(map));

  }

  public static int[][] StartMap() {
    return new int[][] {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, -1, -1, -1, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };
  }

  public static String MapToString(int[][] map) {
    StringBuilder sb = new StringBuilder();

    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        sb.append(String.format("%3d", map[row][col]));
      }
      sb.append("\n");
    }

    return sb.toString();
  }
}

