import React from 'react';

function BillingListItem({arrive, leave, firstName, surName, numberOfDays, totalAmount}){
    return (
        <span>({arrive}, {leave}, {firstName}, {surName}, {numberOfDays}, {totalAmount})</span>
    );
}

export default BillingListItem;
