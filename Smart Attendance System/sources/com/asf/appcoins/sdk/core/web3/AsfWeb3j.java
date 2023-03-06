package com.asf.appcoins.sdk.core.web3;

import java.math.BigDecimal;
import org.web3j.abi.datatypes.Address;
import org.web3j.protocol.core.methods.request.Transaction;
import q.a.n;

public interface AsfWeb3j {
    n<String> call(Transaction transaction);

    n<BigDecimal> getBalance(Address address);

    n<Long> getGasPrice(Address address);

    n<Long> getNonce(Address address);

    n<com.asf.appcoins.sdk.core.transaction.Transaction> getTransactionByHash(String str);

    n<String> sendRawTransaction(String str);
}
