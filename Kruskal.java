#include <bits/stdc++.h>
using namespace std;

struct Edge {
    int u, v, w;
};

int parent[100];

int find(int x) {
    if (parent[x] == x)
        return x;
    return parent[x] = find(parent[x]);
}

void unite(int a, int b) {
    a = find(a);
    b = find(b);
    parent[a] = b;
}

void kruskal(vector<Edge>& edges, int n) {
    sort(edges.begin(), edges.end(),
         [](Edge a, Edge b) {
             return a.w < b.w;
         });

    int cost = 0;

    for (auto e : edges) {
        if (find(e.u) != find(e.v)) {
            cout << e.u << " - " << e.v
                 << " : " << e.w << endl;

            cost += e.w;
            unite(e.u, e.v);
        }
    }

    cout << "Minimum Cost = " << cost;
}

int main() {
    int n = 5;

    vector<Edge> edges = {
        {0,1,2},
        {0,3,6},
        {1,2,3},
        {1,3,8},
        {2,3,7},
        {2,4,5},
        {3,4,9}
    };

    for (int i = 0; i < n; i++)
        parent[i] = i;

    kruskal(edges, n);
}
