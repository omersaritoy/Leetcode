void bubblesort(int dizi[], int size)
{

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int temp;
            if (dizi[j+1] < dizi[j])
            {
                temp = dizi[j];
                dizi[j] = dizi[j+1];
                dizi[j+1] = temp;
            }
        }
    }
    for (int  i = 0; i < size; i++)
    {
        printf("%d.eleman:%d\n",i+1,dizi[i]);
    }
    
}

float median(int dizi[], int size)
{

    float medyan;
    if (size % 2 == 0)
        medyan = ((float)(dizi[(size / 2)] + dizi[(size / 2) - 1]) / 2);

    else
        medyan = dizi[(size / 2) ];

    return medyan;
}