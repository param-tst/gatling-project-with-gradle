var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "51",
        "ok": "25",
        "ko": "26"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "39",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "1521",
        "ok": "877",
        "ko": "1521"
    },
    "meanResponseTime": {
        "total": "68",
        "ok": "77",
        "ko": "59"
    },
    "standardDeviation": {
        "total": "238",
        "ok": "163",
        "ko": "292"
    },
    "percentiles1": {
        "total": "39",
        "ok": "42",
        "ko": "0"
    },
    "percentiles2": {
        "total": "42",
        "ok": "44",
        "ko": "1"
    },
    "percentiles3": {
        "total": "59",
        "ok": "64",
        "ko": "6"
    },
    "percentiles4": {
        "total": "1199",
        "ok": "683",
        "ko": "1142"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 24,
    "percentage": 47
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 1,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 26,
    "percentage": 51
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.02",
        "ok": "0.5",
        "ko": "0.52"
    }
},
contents: {
"req_getemployees-1d169": {
        type: "REQUEST",
        name: "getEmployees",
path: "getEmployees",
pathFormatted: "req_getemployees-1d169",
stats: {
    "name": "getEmployees",
    "numberOfRequests": {
        "total": "26",
        "ok": "0",
        "ko": "26"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "1521",
        "ok": "-",
        "ko": "1521"
    },
    "meanResponseTime": {
        "total": "59",
        "ok": "-",
        "ko": "59"
    },
    "standardDeviation": {
        "total": "292",
        "ok": "-",
        "ko": "292"
    },
    "percentiles1": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles2": {
        "total": "1",
        "ok": "-",
        "ko": "1"
    },
    "percentiles3": {
        "total": "6",
        "ok": "-",
        "ko": "6"
    },
    "percentiles4": {
        "total": "1142",
        "ok": "-",
        "ko": "1142"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 26,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.52",
        "ok": "-",
        "ko": "0.52"
    }
}
    },"req_getrequest-3c8a9": {
        type: "REQUEST",
        name: "getRequest",
path: "getRequest",
pathFormatted: "req_getrequest-3c8a9",
stats: {
    "name": "getRequest",
    "numberOfRequests": {
        "total": "25",
        "ok": "25",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "39",
        "ok": "39",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "877",
        "ok": "877",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "77",
        "ok": "77",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "163",
        "ok": "163",
        "ko": "-"
    },
    "percentiles1": {
        "total": "42",
        "ok": "42",
        "ko": "-"
    },
    "percentiles2": {
        "total": "44",
        "ok": "44",
        "ko": "-"
    },
    "percentiles3": {
        "total": "64",
        "ok": "64",
        "ko": "-"
    },
    "percentiles4": {
        "total": "683",
        "ok": "683",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 24,
    "percentage": 96
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 1,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.5",
        "ok": "0.5",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
