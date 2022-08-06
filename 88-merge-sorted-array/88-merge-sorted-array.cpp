class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int x=INT_MAX;
        int* first;
        int* sec;
        int fctr=0,sctr=0;
        int mergeed[n+m];
        if (m==0 || nums1.empty())
             first=&x;
        else
             first =&nums1[0];

        if( n ==0 || nums2.empty())
             sec =&x;

        else
            sec =&nums2[0];


        for (int i = 0; i < n+m; i++)
        {

            if (*first < *sec)
            {

                mergeed[i]=*first;
                first++;
                fctr++;
                if (fctr==m && sctr<n)
                        first=&x;

            }
            else
            {
                mergeed[i]=*sec;

                sec++;
                sctr++;
                if (fctr< m && sctr==n)
                            sec =&x;

            }
        }

        for (int i=0; i<n+m; i++)
        {
           nums1[i]=mergeed[i];
        }
    }

    };