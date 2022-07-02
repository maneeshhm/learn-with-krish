// const { Socket } = require('dgram');
var net = require('net');

var port = 42181;
var host = '127.0.0.1';

var server = net.createServer((Socket) =>{

    Socket.on('end', () => {

        console.log('Server: client Disconnected');
    });

});

server.on('connection',(Socket) =>{
    console.log(`connected from: ${Socket.remoteAddress}:${Socket.remotePort}`);
    Socket.write('hello client');
    Socket.end();
});

server.on('error', (err) =>{
    throw err;
});

server.listen(port, host);