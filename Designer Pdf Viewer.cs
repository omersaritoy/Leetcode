
List<int> h = new (){ 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 1, 1, 5, 5, 1, 5, 2, 5, 5, 5, 5, 5, 5 };
string word = "torn";

int a=designerPdfViewer(h, word);

Console.WriteLine(a);

static int designerPdfViewer(List<int> h, string word)
{
    const int WIDE = 1;
    int maxHeightOfWord = h[word.IndexOf(word[0])];

    List<string> letters = new List<string>();
    for (int i = 65; i < (65 + 26); i++)
    {
        letters.Add(((char)i).ToString().ToLower());
    }

    for (int i = 0; i < word.Length; i++)
    {
        int index = letters.FindIndex(l => l == word[i].ToString());
        if (maxHeightOfWord < h[index])
        {
            maxHeightOfWord = h[index];
        }
    }

    return maxHeightOfWord * WIDE * word.Length;
}