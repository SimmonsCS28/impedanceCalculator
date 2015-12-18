/**
 * 
 */

var spkrImpedances = [];

function seriesImpedance(impedanceLevels) {
	var serialImpedance = 0;
	for (var i = 0; i < impedanceLevels.length; i++) {
		serialImpedance += impedanceLevels[i];
	}
	return serialImpedance;
}

function parallelImpedance(impedanceLevels) {
	var impedances = 0;
	var j = 0;
	for (var i = 0; i < impedanceLevels.length; i++) {
		impedances = +impedanceLevels[i];
		j++
	}
	var parallelImpedance = impedances / j;
	return parallelImpedance;
}

function multImpedance(impedanceLevels) {
	var impedance = 0;
	for (var i = 0; i < impedanceLevel.length; i++) {
		impedance += (1 / impedanceLevel[i]);
	}
	var diffParallelImpedance = 1 / impedance;
	return diffParallelImpedance;
}