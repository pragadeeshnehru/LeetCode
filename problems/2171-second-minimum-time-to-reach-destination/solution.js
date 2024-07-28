var secondMinimum = function(n, edges, time, change) {
    const adj = Array.from({ length: n }, () => []);
    for (const [u, v] of edges) {
        adj[u - 1].push(v - 1);
        adj[v - 1].push(u - 1);
    }
    
    const dist = Array.from({ length: n }, () => [Number.MAX_SAFE_INTEGER, Number.MAX_SAFE_INTEGER]);
    dist[0][0] = 0;
    
    const q = [[0, 0]];
    
    while (q.length > 0) {
        const [currTime, node] = q.shift();
        
        for (const adjNode of adj[node]) {
            let waitingTime = 0;
            if (Math.floor(currTime / change) % 2 === 1) {
                waitingTime = change - (currTime % change);
            }
            
            const newTime = time + currTime + waitingTime;
            
            if (dist[adjNode][0] > newTime) {
                dist[adjNode][1] = dist[adjNode][0];
                dist[adjNode][0] = newTime;
                q.push([newTime, adjNode]);
            } else if (dist[adjNode][1] > newTime && dist[adjNode][0] < newTime) {
                dist[adjNode][1] = newTime;
                q.push([newTime, adjNode]);
            }
        }
    }
    
    return dist[n-1][1];
};
