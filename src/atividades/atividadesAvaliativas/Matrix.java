package atividades.atividadesAvaliativas;


public class Matrix {
    private double[][] cells;

    public Matrix(double[][] c) {
        cells = c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(double[] fileira: cells) {
            for(double valor: fileira){
                sb.append(String.format("%10.6f", valor));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double[][] toArray() {
        int rows = this.getRows();
        int cols = this.getColumns();
        double[][] copia = new double[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                copia[i][j] = this.getAt(i, j);
            }
        }
        return copia;
    }

    public int getRows() {

        return cells.length;
    }

    public int getColumns() {
        return cells[0].length;
    }

    public double getAt(int linha, int coluna) {
        if(linha >= this.getRows() || coluna >= this.getColumns()) {
            throw new IllegalArgumentException();
        }
        else if(linha < 0 || coluna < 0) {
            throw new IllegalArgumentException();
        }

        return cells[linha][coluna];
    }

    public Matrix plus(Matrix m) {
        if(this.getRows() != m.getRows() || this.getColumns() != m.getColumns()) {
            throw new IllegalArgumentException();
        }

        double[][] soma = new double[cells.length][cells[0].length];
        
        for(int i = 0; i < this.getRows(); i++) {
            for(int j = 0; j < this.getColumns(); j++) {
                soma[i][j] = this.getAt(i, j) + m.getAt(i, j);
            }
        }
        Matrix c = new Matrix(soma);
        return c;
    }

    public Matrix minus(Matrix m) {
        if(this.getRows() != m.getRows() || this.getColumns() != m.getColumns()) {
            throw new IllegalArgumentException();
        }

        double[][] subtracao = new double[cells.length][cells[0].length];
        
        for(int i = 0; i < this.getRows(); i++) {
            for(int j = 0; j < this.getColumns(); j++) {
                subtracao[i][j] = this.getAt(i, j) - m.getAt(i, j);
            }
        }
        Matrix c = new Matrix(subtracao);
        return c;
    }

    public Matrix times(double e) {
        double[][] multiplicacao = new double[cells.length][cells[0].length];

        for(int i = 0; i < this.getRows(); i++) {
            for(int j = 0; j < this.getColumns(); j++) {
                multiplicacao[i][j] = this.getAt(i, j)  * e;
            }
        }
        Matrix c = new Matrix(multiplicacao);
        return c;
    }

    public Matrix times(Matrix m) {
        int n = this.getColumns();

        if(n != m.getRows()) {
            throw new IllegalArgumentException();
        }

        int rows = this.getRows();
        int cols = m.getColumns();
        double[][] multiplicacao = new double[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                for(int k = 0; k < n; k++) {
                    multiplicacao[i][j] = multiplicacao[i][j] + this.getAt(i, k) * m.getAt(k, j);
                }
            }
        }
        return new Matrix(multiplicacao);
    }
     
    public Matrix getTranspose() {
        int rows = this.getRows();
        int cols = this.getColumns();
        double[][] transposta = new double[cols][rows];

        for(int i = 0; i < rows;i++) {
            for(int j = 0; j < cols;j++) {
                transposta[j][i] = this.getAt(i, j);
            }
        }

        return new Matrix(transposta);
    }
    

    public boolean isSquare() {
        return (this.getColumns() == this.getRows());
    }

    public boolean isSymmetric() {
        int cols = this.getColumns();
        int rows = this.getRows();
        if(cols != rows) {
            return false;
        }
        Matrix c = this.getTranspose();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(this.getAt(i, j) != c.getAt(i, j)) {
                    return false;
                }
            }
        }
        return true;

        
    }

    public static void main(String[] args) {
        Matrix a = new Matrix(new double[][] {
            {1, 7, 3},
            {7, 4, 5},
            {3, 5, 0}
          });
          Matrix b = new Matrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
          });
          
          System.out.println(a.isSymmetric());
          System.out.println(b.isSymmetric());
    }
}
