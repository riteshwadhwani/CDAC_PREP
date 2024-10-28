// Que 1

const toUC = (str) => {
  return str.toUpperCase();
};
const processData = (str, toUC) => {
  const output = toUC(str);
  console.log(output);
};

processData("ritesh", toUC);

// Que 2

const multiple = (value) => {
  return value * 2;
};

const changeArr = (a, multiple) => {
  let newArr = a.map((a) => {
    return multiple(a);
  });
  return newArr;
};

let arr = [1, 2, 3, 4, 5];

console.log(changeArr(arr, multiple));

// Que3

const func = (string) => {
  console.log("response");
};
const fetchData = (url, func) => {
  setTimeout(() => {
    func(url);
  }, 10000);
};

fetchData("user/profile", func);

// Que 4

const func1 = (string) => {
  return {
    ok: true,
    res: "response",
  };
};
const fetchData1 = (url, func) => {
  setTimeout(() => {
    let reponse = func1(url);
    if (reponse.ok) {
      console.log(reponse.res);
    } else {
      throw new Error("Response Failed");
    }
  }, 10000);
};

try {
  fetchData1("user/profile", func);
} catch (error) {
  console.log(error);
}

//Que 5

const func2 = (string) => {
  return {
    ok: true,
    res: "response",
  };
};
const fetchData2 = (url, func) => {
  setTimeout(() => {
    let reponse = func1(url);
    if (reponse.ok) {
      return reponse.res;
    } else {
      throw new Error("Response Failed");
    }
  }, 10000);
};

const processData1 = (res) => {
  console.log("Response is ", res);
};
try {
  let response = fetchData2("user/profile", func);
  processData1(response);
} catch (error) {
  console.log(error);
}
