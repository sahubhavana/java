#include <bits/stdc++.h>
using namespace std;

void prim(vector<vector<pair<int,int>>>& adj, int n) {
    vector<int> key(n, INT_MAX);
    vector<bool> used(n, false);

    key[0] = 0;
    int total = 0;

    for (int count = 0; count < n; count++) {
        int u = -1;

        for (int i = 0; i < n; i++)
            if (!used[i] && (u == -1 || key[i] < key[u]))
                u = i;

        used[u] = true;
        total += key[u];

        for (auto edge : adj[u]) {
            int v = edge.first;
            int w = edge.second;

            if (!used[v] && w < key[v])
                key[v] = w;
        }
    }

    cout << "Minimum Cost = " << total;
}

int main() {
    int n = 5;
    vector<vector<pair<int,int>>> adj(n);

    adj[0] = {{1,2}, {3,6}};
    adj[1] = {{0,2}, {2,3}, {3,8}};
    adj[2] = {{1,3}, {3,7}, {4,5}};
    adj[3] = {{0,6}, {1,8}, {2,7}, {4,9}};
    adj[4] = {{2,5}, {3,9}};

    prim(adj, n);
}
