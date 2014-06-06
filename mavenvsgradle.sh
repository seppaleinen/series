function maven(){
	local MAXTIMES
	if [[ ! -z "$1" ]]; then
		MAX_TIMES="$1"
	else
		MAX_TIMES=10
	fi
	local TOTAL_TIME=0;
	for ((i = 1; i <= "$MAX_TIMES"; i++)){
		local TIME=$( mvn clean install 2>/dev/null | grep 'Total time' | awk '{print $4}' )
		TOTAL_TIME=$( echo $TOTAL_TIME + $TIME | bc )
		echo MAVEN BUILD $i "$TIME"
	}
	echo MAVEN TOTAL TIME: "$TOTAL_TIME"
	echo MAVEN AVERAGE TIME: "$( echo $TOTAL_TIME / $MAX_TIMES | bc )"
}
function gradel(){
	local MAXTIMES
	if [[ ! -z "$1" ]]; then
		MAX_TIMES="$1"
	else
		MAX_TIMES=10;
	fi
	local TOTAL_TIME=0;
	for((i = 1; i <= "$MAX_TIMES"; i++)){
		local TIME=$( gradle clean build 2>/dev/null | grep 'Total time: ' | awk '{print $3}' )
		TOTAL_TIME=$( echo $TOTAL_TIME + $TIME | bc )
		echo GRADLE BUILD $i "$TIME"
	}
	echo GRADLE TOTAL TIME: "$TOTAL_TIME"
	echo GRADLE AVERAGE TIME: "$( echo $TOTAL_TIME / $MAX_TIMES | bc )"
}
maven "$1"
gradel "$1"