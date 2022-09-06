# Input
cash_given = int(input())
stock_prices = list(map(int, input().split()))

bnp_cash = cash_given
bnp_stock = 0
timing_cash = cash_given
timing_stock = 0

# Find winner
price_up = 0
price_down = 0
for idx, p in enumerate(stock_prices):

    # BNP
    if bnp_cash >= p:
        added_stock = bnp_cash // p
        bnp_stock += added_stock
        bnp_cash -= added_stock * p

    # TIMING
    # Price check
    if idx > 0 and p > stock_prices[idx - 1]:
        price_up += 1
        price_down = 0
        # 가격 3일 연속 상승 : 전량 매도
        if price_up >= 3 and timing_cash >= p:
            added_cash = p * timing_stock
            timing_cash += added_cash
            timing_stock = 0
            price_up = 0
        # 가격 3일 연속 하락 : 전량 매수
    elif idx > 0 and p < stock_prices[idx - 1]:
        price_down += 1
        price_up = 0
        # 가격 3일 연속 하락 : 전량 매수
        if price_down >= 3 and timing_cash >= p:
            bought_stock = timing_cash // p
            timing_stock += bought_stock
            timing_cash -= bought_stock * p
            price_down = 0

# Output
asset_bnp = bnp_cash + bnp_stock * stock_prices[-1]
asset_timing = timing_cash + timing_stock * stock_prices[-1]

message = 'SAMESAME'
if asset_bnp < asset_timing:
    message = 'TIMING'
elif asset_bnp > asset_timing:
    message = 'BNP'
print(message)