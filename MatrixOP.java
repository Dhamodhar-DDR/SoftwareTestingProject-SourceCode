import java.util.*;  

public class MatrixOP{
    public static void main(String args[])
    {  
        System.out.println("*****************Matrix Operations*****************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Scalar Multiplication");
        System.out.println("4. Matrix Multiplication");
        System.out.println("5. Find Determinant");
        System.out.println("6. Find Inverse");
        System.out.println("7. Transpose");
        System.out.println("8. Check whether given matrix is orthogonal");
        System.out.println("9. Check whether given matrix is Idempotent");
        System.out.println("10. Find the trace of matrix");
        System.out.println("11. Find rank of the matrix");
        System.out.println("12. Square of given matrix");
        System.out.println("13. Check if symmetric");
        System.out.println("14. Scalar Addition");
        System.out.println("15. Scalar Subtraction");
        System.out.println("Press any integer corresponding to the operation to perform the matrix operation");
        Scanner sc = new Scanner(System.in);
        int inp;
        inp = sc.nextInt();
       
        switch (inp) {
        case 1: {
            System.out.println("Addition: ");
    		int row1,row2,col1,col2;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter number of rows in 2nd matrix");
            row2 = sc.nextInt();
            System.out.print("Enter number of columns in 2nd matrix");
            col2 = sc.nextInt();
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            System.out.println("Enter elements of array 1");
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
            System.out.println("Enter elements of array 2");
            for(int i  =0;i<row2;i++) for(int j  =0;j<col2;j++) b[i][j] = sc.nextInt();
    		addition(row1,col1,row2,col2,a,b);
            break;
        }
        case 2:{
            System.out.println("Subtraction: ");
    		int row1,row2,col1,col2;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter number of rows in 2nd matrix");
            row2 = sc.nextInt();
            System.out.print("Enter number of columns in 2nd matrix");
            col2 = sc.nextInt();
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            System.out.println("Enter elements of array 1");
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
            System.out.println("Enter elements of array 2");
            for(int i  =0;i<row2;i++) for(int j  =0;j<col2;j++) b[i][j] = sc.nextInt();
    		subtraction(row1,col1,row2,col2,a,b);
            break;
        }
        case 3:{
            System.out.println("Scalar Multiplication: ");
    		int row1,col1,k;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter a scalar integer of for multiplication");
    		k = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		scalar_multiplication(row1,col1,a,k);
            break;
        }
        case 4:{
            System.out.println("Matrix Multiplication: ");
    		int row1,row2,col1,col2;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter number of rows in 2nd matrix");
            row2 = sc.nextInt();
            System.out.print("Enter number of columns in 2nd matrix");
            col2 = sc.nextInt();
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            System.out.println("Enter elements of array 1");
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
            System.out.println("Enter elements of array 2");
            for(int i  =0;i<row2;i++) for(int j  =0;j<col2;j++) b[i][j] = sc.nextInt();
    		matrix_multiplication(row1,col1,row2,col2,a,b);
            break;
        }
        case 5:{
            System.out.println("Determinant: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
    		double a[][] = new double[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextDouble();
            System.out.println(determinantOfMatrix(row1,col1,a));
            break;
        }
        case 6:{
            System.out.println("Scalar Multiplication: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
    		double a[][] = new double[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextDouble();
    		inverse(row1,col1,a);
            break;
        }
        case 7:{
            System.out.println("Transpose: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		transpose(row1,col1,a);
            break;
        }
        case 8:{
            System.out.println("Check Orthogonal: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		System.out.println(check_orthogonal(row1,col1,a));
            break;
        }
        case 9:{
            System.out.println("Check Idempotent: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		System.out.println(check_idempotent(row1,col1,a));
            break;
        }
        case 10:{
        	System.out.println("Find the trace: ");
        	int row1,col1;
        	System.out.print("Enter number of rows in 1st matrix");
        	row1 = sc.nextInt();
        	System.out.print("Enter number of columns in 1st matrix");
        	col1 = sc.nextInt();
        	System.out.print("Enter elements of array");
        	int a[][] = new int[row1][col1];
        	for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
        	System.out.println(find_trace(row1,col1,a));
        	break;
        }
        case 11:{
            System.out.println("Find the rank of the matrix: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		System.out.println(rankOfMatrix(row1,col1,a));
            break;
        }
        case 12:{
            System.out.println("Find the square: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		square(row1,col1,a);
            break;
        }
        case 13:{
            System.out.println("Check Symmetric: ");
    		int row1,col1;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
            System.out.println(checkSymmetric(row1,col1,a));
            break;
        }
        case 14:{
            System.out.println("Scalar Addition: ");
    		int row1,col1,k;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter a scalar integer of for addition");
    		k = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
    		scalar_addition(row1,col1,a,k);
            break;
        }
        case 15:{
            System.out.println("Scalar Subtraction: ");
    		int row1,col1,k;
            System.out.print("Enter number of rows in 1st matrix");
    		row1 = sc.nextInt();
    		System.out.print("Enter number of columns in 1st matrix");
    		col1 = sc.nextInt();
    		System.out.print("Enter a scalar integer of for subtraction");
    		k = sc.nextInt();
    		System.out.print("Enter elements of array");
            int a[][] = new int[row1][col1];
            for(int i  =0;i<row1;i++) for(int j  =0;j<col1;j++) a[i][j] = sc.nextInt();
            scalar_subtraction(row1,col1,a,k);
            break;
        }
        default:
            break;
        }
    }
   
    // Adding Two matrices
    public static int[][] addition(int row1,int col1,int row2,int col2,int a[][],int b[][])
    {
        // Requirement check for matrix multiplication
        if(col1 < 0)
        {
            System.out.println("Invalid Number of columns");        
            return null;
        }
        else if(col2 < 0)
        {
            System.out.println("Invalid Number of columns");
            return null;
        }
        else if(row1 < 0)
        {
            System.out.println("Invalid Number of rows");
            return null;
        }
        else if(row2 < 0)
        {
            System.out.println("Invalid Number of rows");
            return null;
        }
        else if(row1 != row2) 
        {
            System.out.println("Number of rows in each matrix must be of same");
            return null;
        }
        else if(col1 != col2)
        {   
            System.out.println("Number of columns in each matrix must be of same");
            return null;
        }
        else 
        {
        	// Matrix to store sum
        	int sum[][] = new int[row1][col1];

            for(int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            // Displaying the result
            System.out.println("Sum of two matrices is: ");
            
            return sum;
        }
    }

    // Subtracting Two matrices
    public static int[][] subtraction(int row1,int col1,int row2,int col2,int a[][],int b[][])
    {
    	// Requirement check for matrix multiplication
        if(col1 < 0)
        {
            System.out.println("Invalid Number of columns");        
            return null;
        }
        else if(col2 < 0)
        {
            System.out.println("Invalid Number of columns");
            return null;
        }
        else if(row1 < 0)
        {
            System.out.println("Invalid Number of rows");
            return null;
        }
        else if(row2 < 0)
        {
            System.out.println("Invalid Number of rows");
            return null;
        }
        else if(row1 != row2) 
        {
            System.out.println("Number of rows in each matrix must be of same");
            return null;
        }
        else if(col1 != col2)
        {   
            System.out.println("Number of columns in each matrix must be of same");
            return null;
        }
        else 
        {
        	// Matrix to store sum
        	int diff[][] = new int[row1][col1];

            for(int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    diff[i][j] = a[i][j] - b[i][j];
                }
            }
            // Displaying the result
            System.out.println("Difference of two matrices is: ");
            
            return diff;
        }
    }    
    
    public static int[][] scalar_addition(int n,int m,int a[][],int k)
    {
        int b[][]= new int[n][m];
        
        for(int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                b[i][j] = k+a[i][j];
            }
        }

        // Displaying the result
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        return b;
    }
    
    public static int[][] scalar_subtraction(int n,int m,int a[][],int k)
    {
        int b[][]= new int[n][m];
        
        for(int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                b[i][j] = a[i][j]-k;
            }
        }

        // Displaying the result
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        return b;
    }
    
    public static int[][] scalar_multiplication(int n,int m,int a[][],int k)
    {
        int b[][]= new int[n][m];
        
        for(int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                b[i][j] = k*a[i][j];
            }
        }

        // Displaying the result
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        return b;
    }

    //Matrix Multiplication
    public static int[][] matrix_multiplication(int row1,int col1,int row2,int col2,int a[][],int b[][]) 
    {
        // Requirement check for matrix multiplication
        if(col1 <= 0)
        {
            System.out.println("Invalid Number of columns");       
            return null;  
        }
        
        if(col2 <= 0)
        {
            System.out.println("Invalid Number of columns");
            return null; 
        }


        else if(row1 <= 0)
        {
            System.out.println("Invalid Number of rows");
            return null; 
        }


        else if(row2 <= 0)
        {
            System.out.println("Invalid Number of rows");   
            return null; 
        }

        else if (col1 != row2) 
        {
            System.out.println("Matrix multiplication is not possible");
            return null; 
        }
        else
        {
            int c[][] = new int[row1][col2];

            // Input the values of matrices
            

            // Perform matrix multiplication
            // Using for loop
            System.out.println("\nMatrix multiplication is : ");

            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col2; j++) 
                {
                    // Initialize the element C(i,j) with zero
                    c[i][j] = 0;

                    // Dot product calculation
                    for (int k = 0; k < col1; k++) 
                    {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    
                    System.out.print(c[i][j] + " ");
                }

                System.out.println();
            }
            return c;
        }
    } 

    public static double determinantOfMatrix(int n,int m,double mat[][])
    {        
        if(m != n)
        {
            System.out.println("Given Matrix is not a square matrix");
            throw new ArithmeticException("Given Matrix is not a square matrix");  
        }
        else
        {
	        int index; 
	        double det = 1,num1, num2,total = 1;
	        double[] temp = new double[n + 1];
	 
	        for (int i = 0; i < n; i++) 
	        {
	            index = i; 
	            
	            while (mat[index][i] == 0 && index < n) 
	            {
	                index++;
	            }
	            if (index == n) 
	            {
	                continue;
	            }
	            if (index != i) 
	            {
	                double sw_temp;
	                // loop for swaping the diagonal element row and index row
	                for (int j = 0; j < n; j++) 
	                {
	                    sw_temp = mat[index][j];
	                    mat[index][j] = mat[i][j];
	                    mat[i][j] = sw_temp;
	                }
	                // determinant sign changes when we shift rows go through determinant properties
	                det = (int)(det * Math.pow(-1, index - i));
	            }
	 
	            // storing the values of diagonal row elements
	            for (int j = 0; j < n; j++) 
	            {
	                temp[j] = mat[i][j];
	            }
	 
	            // traversing every row below the diagonal element
	            
	            for (int j = i + 1; j < n; j++) 
	            {
	                num1 = temp[i]; 
	                num2 = mat[j][i]; 
	 
	                // traversing every column of row
	                for (int k = 0; k < n; k++) 
	                {
	                    mat[j][k] = (num1 * mat[j][k])- (num2 * temp[k]);
	                }
	                total = total * num1; 
	            }
	        }
	 
	        // multiplying the diagonal elements to get determinant
	        for (int i = 0; i < n; i++) 
	        {
	            det = det * mat[i][i];
	        }
	
	        System.out.println(det / total);
	        det = det/total;
	        return det;
        }
    }

    public static double[][] inverse(int n,int m,double a[][])
    {
        
        if(m != n)
        {
            System.out.println("Given Matrix is not a square matrix");
            return null;
        }

        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        
        // Initialize the index
        for (int i=0; i<n; ++i) 
        {
            b[i][i] = 1;
            index[i] = i;
        }

        // Transform the matrix into an upper triangle
        double c[] = new double[n];
        
        // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
        
        // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) 	
            {
                double pj = a[index[i]][j]/a[index[j]][j];

            // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

            // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                {
                    a[index[i]][l] -= pj*a[index[j]][l];
                }
            }
        }

        // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
        {
            for (int j=i+1; j<n; ++j)
            {
                for (int l=0; l<n; ++l)
                {
                    b[index[j]][l]-= a[index[j]][i]*b[index[i]][l];
                }
            }
        }

        // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int l=j+1; l<n; ++l) 
                {
                    x[j][i] -= a[index[j]][l]*x[l][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
                
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        return x;
    }

    public static int[][] transpose(int row1,int col1,int a[][])
    {
        //Matrix to store transpose
        int at[][] = new int[col1][row1];   
   
        //Filling in values of at
        for(int i = 0; i < row1; i++) 
        {
            for (int j = 0; j < col1; j++) 
            {
                at[j][i] = a[i][j];
            }
        }
        
        //Display
        for (int i = 0; i < col1; i++) 
        {
            for (int j = 0; j < row1; j++) 
            {
                System.out.print(at[i][j] + " ");
            }
            System.out.println();
        }
        
        //Return the transposed matrix
        return at;
    }


    public static int check_orthogonal(int row1,int col1,int a[][])
    {
    	if(col1 <= 0)
        {
            System.out.println("Invalid Number of columns");
            return -1;
        }
        else if(row1 <= 0)
        {
            System.out.println("Invalid Number of rows");
            return -1;
        }
        else
        {
            int at[][] = new int[col1][row1];
            
            //Store multiplication of matrix in c
            int c[][] = new int[row1][row1];

            //Fill in values of at
            for(int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    at[j][i] = a[i][j];
                }
            }

            // Perform matrix multiplication
            // Using for loop

            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < row1; j++) 
                {
                    // Initialize the element C(i,j) with zero
                    c[i][j] = 0;

                    // Dot product calculation
                    for (int k = 0; k < col1; k++) 
                    {
                        c[i][j] += a[i][k] * at[k][j];
                    }
                }
            }
            int flag = 1;
            col1 = row1;
//            //Display
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    if((i!=j && c[i][j] != 0) || (i==j && c[i][j] != 1))
                    {
                        System.out.println("Given matrix is not orthogonal");
                        flag = 0;
                    }
                }
            }
            System.out.println("Given matrix is orthogonal");
            return flag;
        }
        //Store transpose of matrix in at
    }
    
	public static int check_idempotent(int row1,int col1,int a[][])
    {
        //Matrix: a
        //Store mult
        int c[][] = new int[row1][col1];

        if(row1 != col1)
        {
            System.out.println("Number of rows and columns must be same");
            return -1;    
        }    
        else
        {
            // Perform matrix multiplication
            // Using for loop
    
            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    // Initialize the element C(i,j) with zero
                    c[i][j] = 0;
    
                    // Dot product calculation
                    for (int k = 0; k < col1; k++) 
                    {
                        c[i][j] += a[i][k] * a[k][j];
                    }
                }
            }
            int flag = 1;

            for (int i = 0; i < row1; i++) 
            {
                for (int j = 0; j < col1; j++) 
                {
                    if(c[i][j] != a[i][j])
                    {
                        System.out.println("Given matrix is not idempotent");
                        flag = 0;
                    }
                }
            }
            // If it reaches here, then it is idempotent
            System.out.println("Given matrix is idempotent");
            
            return flag;    
        }    
    }


    public static int find_trace(int row1,int col1, int a[][])
    {
        int sum = 0; 
        for (int i = 0; i < row1; i++) 
        {
            sum += a[i][i];
        }
        return sum;    
    }

    public static int rankOfMatrix(int row1,int col1,int mat[][])
    {
        // Initialize rank with column
        int rank = col1;
        
        for (int row = 0; row < rank; row++)
        {
            // Before we visit current row 'row', we make sure that mat[row][0],....mat[row][row-1] are 0.
            // Diagonal element is not zero
            if (mat[row][row] != 0)
            {
                for (int col = 0; col < row1; col++)
                {
                    if (col != row)
                    {
                        // This makes all entries of current column as 0 except entry 'mat[row][row]'
                        double mult = (double)mat[col][row] /mat[row][row];
                        for (int i = 0; i < rank; i++)
                        {
                            mat[col][i] -= mult*mat[row][i];
                        }
                    }
                }
            }
            else
            {
                // Diagonal element is already zero.
                // Two cases arise: 1) If there is a row below it with non-zero entry, then swap this row with that row and process that row
                // 2) If all elements in current column below mat[r][row] are 0, then remove this column by 
                // swapping it with last column and reducing number of columns by 1.
                boolean reduce = true;
    
                // Find the non-zero element in current column
                for (int i = row + 1; i < row1; i++)
                {
                    // Swap the row with non-zero element with this row.
                    if (mat[i][row] != 0)
                    {
                        for (int o = 0; o < rank; o++)
                        {
                            int temp = mat[row][o];
                            mat[row][o] = mat[i][o];
                            mat[i][o] = temp;
                        }
                        reduce = false;
                        break ;
                    }
                }
    
                // If we did not find any row with non-zero element in current column, then all values in this column are 0.
                if (reduce)
                {
                    rank--; // Reduce number of columns
                    
                    // Copy the last column here
                    for (int i = 0; i < row1; i ++)
                    {
                        mat[i][row] = mat[i][rank];
                    }
                }
                row--;
            }
        }

        System.out.println(rank);
        return rank;
    }



    public static int[][] square(int row1, int col1, int[][] a) 
    {

        // Requirement check for matrix multiplication
        if(col1 == 0)
        {
            System.out.println("Invalid Number of columns");     
            return null;
        }
        else if(row1 == 0)
        {
            System.out.println("Invalid Number of rows");
            return null;    
        }
        else if (col1 != row1) 
        {
            System.out.println("Matrix multiplication is not possible");
            return null;
        }
        else 
        {
	        int c[][] = new int[row1][col1];
	        for (int i = 0; i < row1; i++) 
	        {
	            for (int j = 0; j < col1; j++) 
	            {
	                // Initialize the element C(i,j) with zero
	                c[i][j] = 0;
	
	                // Dot product calculation
	                for (int k = 0; k < col1; k++) 
	                {
	                    c[i][j] += a[i][k] * a[k][j];
	                }
	                
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	        return c;
        }
    } 


    public static int checkSymmetric(int row, int col, int[][] mat)
    {

        // Display message
        System.out.println("Enter the matrix elements:");

        // Nested for loop for traversing matrix

        // Outer loop for rows

        int i, j, flag = 1;

        // Finding transpose of the matrix
        int[][] transpose = new int[col][row];

        // Again, nested for loop for matrix iteration
        // Outer loop for rows
        for (i = 0; i < row; i++) 
        {
            // Inner loop for columns
            for (j = 0; j < col; j++) 
            {
                // Print matrix elements
                transpose[j][i] = mat[i][j];
            }
        }

        // Condition check over Matrix 1 with Matrix 2

        if (row == col) 
        {

        // Outer loop for rows
            for (i = 0; i < row; i++) 
            {
        // Inner loop for columns
                for (j = 0; j < col; j++) 
                {

                // Comparing two matrices
                    if (mat[i][j] != transpose[i][j]) 
                    {
                        flag = 0;
                        break;
                    }
                }

                // Setting a flag value for symmetric matrix
                if (flag == 0) 
                {
                    // Display message
                    System.out.print("\nThe matrix is not symmetric");
                    return 0;
                }
            }

            // Setting a flag value different from above
            // for symmetric matrix
            if (flag == 1) 
            {
                // Display message
                System.out.print("\nThe matrix is symmetric");
                return 1;
            }
            else 
        	{
            	return 0; 
        	}
            
        }
        // If it isn't a square matrix
        // then it can't be a symmetric matrix
        else 
        {
        // Display message
            System.out.print("\nThe matrix is not symmetric");

            return 0;
        }
    }
}