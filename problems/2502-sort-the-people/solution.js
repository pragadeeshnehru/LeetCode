var sortPeople = function (names, heights) {
    let n = names.length;
    let mapping = {};

    for (let i = 0; i < n; ++i) {
        mapping[heights[i]] = names[i];
    }

    heights.sort((a, b) => b - a);

    for (let i = 0; i < n; ++i) {
        names[i] = mapping[heights[i]];
    }

    return names;
};








