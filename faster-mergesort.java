private static void merge(Comparable[] a, int lo, int mid, int hi) { 
   for (int i = lo; i <= mid; i++)
      aux[i] = a[i]; 
   
   for (int j = mid+1; j <= hi; j++)
      aux[j] = a[hi-j+mid+1];
  
   int i = lo, j = hi; 
   for (int k = lo; k <= hi; k++) 
      if (less(aux[j], aux[i])) a[k] = aux[j--];
      else                      a[k] = aux[i++];
} 
